# Assessment 2 (2025)


* Each assignment must be the sole work of the student who received it.
* Assignment will be closely monitored, and students may be asked to explain any suspicious similarities with any piece of code available.
* When you submit an assignment that is not your own original work you will get Zero _(we have some tools to identify plagio)_.


Before trying to execute anything, please configure this project to use <u>Java 17</u>.

To achieve that you can follow this video link:

<div >
  <a href="http://pages.ipb.pt/~ellobo/jdk17-setup.mov"><img  src=".assets/video.png" style="width: 400px" alt="video" /></a>
</div>
<small style="color: #ccc"><i><b style="color: red">Note</b>: Please skip the part after 0:35.</i></small>


This assignment contains an _embedded evaluation application_ which will allow you to see your progress in real-time. You will need **Docker** and a (recent) version of **IntelliJ Community Edition** (some help [here](https://gitlab.estig.ipb.pt/dsys/ds-classes/-/wikis/first-steps)).

To start the assessment perform the following steps:

* There's a `docker-compose.yml` file on the root of this project containing the service(s)
  needed for the assessment. We advise the use of the terminal - the *bot* inside may send useful information to the console, you can start it by performing:
    * `cd` to the project's **root directory**;
      <div style="color: #aaa; font-style: italic; font-size: 0.9em">Right-click on the project's root in IntelliJ and "Copy Path/Reference" > "Absolute Path"</div>
    * `docker compose up`
* Use your browser to open this url - http://localhost:8989 - if all went well, you should see the assessment information
  and the completion status of each step.
  On the lower left there's a message panel, and on the right, a status log (with useful information to diagnose your progress).
* The submission button will become enabled when all steps are complete.
* In the chance of a problem submitting, use the Download ZIP option to download the *deliverable* zip file and reach out to the teachers.


The bot inside the docker needs to reach out to your program in the designated port.
Firewalls may block this type of behavior where a program inside a docker container tries to
contact a port on the host (`localhost`/`127.0.0.1`).

> Connection timeout is set to `5s` (`5000ms`) and gRpc Deadline happens after `3s` (`3000ms`).

If you encounter this issue, please disable your firewall momentarily.


Make sure you write all your conde under the `src/main/java` under the already created package `pt.ipb.dsys.assessment.two`. 

# Bank Transfer Service

Design and implement a `gRPC` based **bank transfer** service.
Clients connecting to this service will be able to `create` multiple `Account` lists and, transfer
currency between accounts.
After successful transfer, the service will notify a remote `gRPC` service of each **transfer**.
The *bot* will request for the balance of random accounts.


Your application will implement both a `gRPC` **client** and **server**.


Your client should establish a `channel` to the `gRPC` server **already running** on the address `127.0.0.1` and
port `4444`.
Use the `channel` to obtain a `stub` for the `AnswerServiceGrpc` service.

<b style="color: red">You don't have to implement this service, it's already running inside the docker!</b>

For more details, inspect the `AnserService.proto` file in your project tree.


You are required to complete the provided `BankTransferService.proto` file, as follows:

&rightarrow; Create the following messages, and corresponding attributes:

- `BankAccount`:
    - `id`: `int64`
    - `name`: `string`
    - `balance`: `double`
- `BankAccountList`:
    - `accounts`: `BankAccount` (repeated)
- `TransferRequest`:
    - `src`: `int64`
    - `dst`: `int64`
    - `amount`: `double`
- `TransferResponse`:
    - `result`: `string`
- `AccountBalanceRequest`:
    - `id`: `int64`
- `AccountBalanceResponse`:
    - `balance`: `double`

Complete the `BankTransferService` service, with the following `rpc` methods:

- `create(BankAccountList) -> Void`: stores each `accounts` in the `BankAccountList` in a local dictionary (`id -> BankAccount`);
- `transfer(TransferRequest) -> TransferResponse`: updates<sup>1</sup> the balance of both accounts in the local dictionary, if both exist and the balance allows, 
  returns a `TransferResponse` with `result = 'OK'`, otherwise respond with `result = 'FAILED'`;
  - Upon completing the transfer, invokes the `bankTransfer()` method in the  `AnswerServiceGrpc` service;  
- `balance(AccountBalanceRequest) -> AccountBalanceResponse`: returns the balance of the account with the id `AccountBalanceRequest.id` from the local dictionary, if the account doesn't exist, returns -1;
- `reset(Void) -> Void`: clears the local dictionary;

The `gRPC` server should listen on port `9090`.

Upon clicking the **Start Activity &triangleright;** button, the *bot* inside the docker will:

* Try to connect to the client at port `9090`;
* Invoke the `reset` method;
* Invoke the `create` method with a random list of accounts;
* Perform multiple calls to `transfer` method with two random accounts (`src` and `dst`) and an `amount` to transfer between them;
    * For each transfer, the *bot* expects a call to `AnswerService::bankTransfer(TransferNotification)` with the relevant information;
* Each `TransferNotification` received by the *bot* can possibly trigger a call to `balance` for verification;

> **Notes**:
> - Beware of race conditions, all methods can potentially be called concurrently;
> - gRPC doesn't have a `void` type, when needed use the `Void` message imported from `Common.proto`;
> - Check for any reports in the **Status log**!... if an answer is unexpected, a reason will be provided.
> - <sup>1</sup>`gRPC` objects are _immutable_. The solution is to replace them with a new copy (hint: use `obj.toBuilder()` to retain the attributes)

