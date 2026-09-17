plugins {
    kotlin("jvm") version "1.9.22"
    application // <--- Mana shu qator dasturni to'g'ri yakunlash uchun kerak
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("hello.MainKt") // <--- Bizning kodimiz qayerda turganini robotga ko'rsatamiz
}
