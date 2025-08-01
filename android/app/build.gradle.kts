// android/app/build.gradle.kts

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")  // remove if you’re not using Firebase
}

android {
    namespace = "com.example.habitt_tracker"      // ← change this if your package ID differs
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.habitt_tracker"  // ← must match your AndroidManifest
        minSdk = 24                                  // supports Android 7.0+
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            // Turn OFF code shrinking (R8/ProGuard)
            isMinifyEnabled = false

            // Turn OFF resource shrinking
            isShrinkResources = false

            // If you later set up signingConfigs, you can uncomment this:
            // signingConfig = signingConfigs.getByName("release")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.10")
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")

    // If you’re using Firebase, include these. Otherwise you can remove them:
    // implementation(platform("com.google.firebase:firebase-bom:31.1.0"))
    // implementation("com.google.firebase:firebase-analytics-ktx")
    // implementation("com.google.firebase:firebase-firestore-ktx")
}

// For Firebase projects only; remove this line if you’re not using Firebase:
apply(plugin = "com.google.gms.google-services")
