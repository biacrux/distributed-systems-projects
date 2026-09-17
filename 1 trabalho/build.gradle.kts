plugins {
    java
}

group = "pt.ipb.dsys.assessmet"
version = "assessment-2025-1-1"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

dependencies {
    implementation("javax.annotation:javax.annotation-api:1.3.1")
    implementation("ch.qos.logback:logback-classic:1.4.6")
}

