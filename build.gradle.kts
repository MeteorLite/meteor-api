import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins{
    java
    kotlin("jvm") version "1.6.10"
    `maven-publish`
}

group = "org.meteorlite"
val release by rootProject.extra { "1.0.0" }

repositories{
    mavenCentral()
}
dependencies{
    testImplementation("org.junit.jupiter:junit-jupiter-api:_")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation(kotlin("stdlib-jdk8"))
}
tasks.test{
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