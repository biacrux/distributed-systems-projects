plugins {
    java
    id("com.google.protobuf") version "0.9.2"
}

group = "pt.ipb.dsys.assessmet"
version = "assessment-3"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    implementation("org.jgroups:jgroups:5.1.6.Final")
    implementation("com.google.guava:guava:31.0.1-jre")
    implementation("javax.annotation:javax.annotation-api:1.3.1")
    implementation("javax.annotation:javax.annotation-api:1.3.1")
    implementation("ch.qos.logback:logback-classic:1.4.6")
}
