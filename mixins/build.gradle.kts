plugins {
     java
    id("org.jetbrains.kotlin.jvm")
}

group = "org.meteorlite"
version = "1.0-SNAPSHOT"
java {
    disableAutoTargetJvm()
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
repositories {
    mavenCentral()
}

dependencies {
    compileOnly(gradleApi())
    compileOnly(group = "com.google.guava", name = "guava", version = "23.2-jre")
    compileOnly(group = "javax.inject", name = "javax.inject", version = "1")
    compileOnly(group = "commons-io", name = "commons-io", version = "2.8.0")
    compileOnly(project(":annotations"))
    compileOnly(project(":api-rs"))
    compileOnly(project(":osrs"))
    compileOnly(project(":api"))
    compileOnly(project(":logger"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
tasks{
test {
    useJUnitPlatform()
}
compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
compileTestKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
}