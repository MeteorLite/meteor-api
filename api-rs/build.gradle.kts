import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm")
    `maven-publish`
}

group =  "meteor"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":annotations"))
    implementation(project(":api"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:_")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation(kotlin("stdlib-jdk8"))
}

publishing {
    publications {
        create<MavenPublication>("mavenLocal") {
            version = rootProject.extra.get("release") as String
            from(components["java"])
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}