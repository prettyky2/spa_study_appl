plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.myapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapp"
        minSdk = 34
        targetSdk = 34
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
    packagingOptions {
        resources {
            excludes += "META-INF/INDEX.LIST"
            excludes += "META-INF/LICENSE"
            excludes += "META-INF/LICENSE.txt"
            excludes += "META-INF/NOTICE"
            excludes += "META-INF/NOTICE.txt"
            excludes += "META-INF/DEPENDENCIES"
        }
    }

    sourceSets {
        getByName("main") {
            res.srcDirs("src/main/res/raw")
        }
    }
}

dependencies {
	implementation ("com.google.android.material:material:1.9.0")
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.poi)
    implementation(libs.poi.ooxml)
    implementation(libs.commons.collections4)
    implementation(libs.xmlbeans)
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("com.google.cloud:google-cloud-texttospeech:2.15.0")
    implementation("com.google.guava:guava:32.0.1-jre")
    implementation("io.grpc:grpc-okhttp:1.57.0")

}