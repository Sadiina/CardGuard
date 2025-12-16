plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.cardgaurd"
    compileSdk = 35  // Specify compile SDK version

    defaultConfig {
        applicationId = "com.example.cardgaurd"
        minSdk = 34  // Set the minimum SDK version
        targetSdk = 35  // Set the target SDK version
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    // Exclude the duplicate META-INF/NOTICE.md files
    packagingOptions {
        exclude("META-INF/NOTICE.md")
        exclude("META-INF/LICENSE.md")
    }
}

dependencies {
    // Firebase BOM to manage all Firebase dependencies and their versions
    implementation(platform("com.google.firebase:firebase-bom:33.12.0"))

    // Firebase SDKs
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-auth")  // Firebase Authentication
    implementation("com.google.firebase:firebase-firestore")  // Firestore
    implementation("com.google.firebase:firebase-database")  // Firebase Realtime Database
    implementation ("com.google.android.material:material:1.6.0")
    implementation ("com.google.firebase:firebase-auth:22.3.1")
    implementation ("com.google.firebase:firebase-functions:20.4.1")
    // Android libraries
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.core.ktx)
    implementation("androidx.biometric:biometric:1.1.0")
    // JavaMail dependencies for Android
    implementation("com.sun.mail:android-mail:1.6.6")  // JavaMail for Android
    implementation("com.sun.mail:android-activation:1.6.6")  // JavaMail Activation Framework
    implementation ("com.google.android.material:material:1.12.0")
    // Testing libraries
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    android {
        defaultConfig {
            vectorDrawables.useSupportLibrary = true
        }
}

// Apply the google-services plugin to enable Firebase services
apply(plugin = "com.google.gms.google-services")}


