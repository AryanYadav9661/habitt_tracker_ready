buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Google Services for Firebase
        classpath("com.google.gms:google-services:4.4.2")
        classpath("com.android.tools.build:gradle:8.5.2")
        classpath(kotlin("gradle-plugin", version = "1.9.23"))
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
