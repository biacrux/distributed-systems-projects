# Assessment 1 (2025)


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

> Socket connection timeout is set to `3s` (`3000ms`) and, `SO_TIMEOUT` (read operations) is set to `5s` (`5000ms`).

If you encounter this issue, please disable your firewall momentarily.


Make sure you write all your conde under the `src/main/java` under the already created package `pt.ipb.dsys.assessment.one`. 

# Building a Multi-threaded HTTP Web Server

Design and implement a simple web server that can serve static files over the HTTP protocol.
The server must be capable of handling multiple client requests concurrently using threads.


You will implement a basic `HTTP/1.0`-compliant web server that:

* Listens for incoming TCP client connections on address `0.0.0.0` and port `4444`.
* Parses HTTP GET requests with the syntax:
  ```http request
  GET /{filename} HTTP/1.1
  Header1: Value1
  Header2: Value2
  
  ```
  <small>The last line is a composed by a `\r\n` - i.e. an empty line</small>
* Extracting the `{filename}` from the first line.
* If the file exists in the `file-root` (already in the project), respond with:
  ```http request
  HTTP/1.1 200 OK
  Date: {date}
  Server: GSR/59440
  Content-type: {contentType}
  Content-length: {contentLength}
  
  {fileData}
  ```
  Where:
  * `{date}` - the current date (`new Date().toString()`)
  * `{contentType}` - the current file's content type, ex.: `image/png` (obtained with `Files.probeContentType(...)`);
  * `{contentLength}` - the byte length of the file;
  * The empty line after all the headers is, again, composed by `\r\n`;
  * Append the file data (`byte[]`) at `{fileData}`.
* If the file doesn't exist, respond with:
  ```http request
  HTTP/1.1 404 Not Found
  Date: {date}
  Server: GSR/59440
  
  ```
  <small>The last line, again, is a composed by a `\r\n`</small>
* Handles multiple clients concurrently using threads.

> **Notes**:
> - You do not need to implement the client, the *bot* will be the client(s);
> - If your implementation is correct, you should be able to see the rendered page with a browser at http://localhost:4444/index.html;
> - When sending the file to the client, you need to send it in **binary** - `PrintWriter` will not work!
> - In this client type, there's no `null` line at the end of the request, instead a `\r\n` marks the end of the request (hint: use `line.isEmpty()`)
