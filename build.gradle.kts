import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.0"
}

group = "org.nobledev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://papermc.io/repo/repository/maven-public/")}
    maven {  url = uri("http://nexus.nobledev.org:8081/repository/maven-releases/")}
}

dependencies {
    implementation("org.nobledev.arkane:architecture:1.0.3-B")
    compileOnly("com.destroystokyo.paper", "paper-api", "1.16.5-R0.1-SNAPSHOT")
}



tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}