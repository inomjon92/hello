plugins {
    kotlin("jvm") version "1.9.22"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("MainKt") // <--- Endi robot to'g'ridan-to'g'ri faylni o'zini qidiradi
}
