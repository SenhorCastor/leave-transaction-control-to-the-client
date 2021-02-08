group = "io.repos"

tasks.getByName<Jar>("jar") {
    archiveBaseName.set("io.repos")
}

dependencies {
    implementation(Dependencies.mongo.kMongo)

    implementation(project(":entities"))
    implementation(project(":usecases"))
    implementation(project(":transaction"))
}
