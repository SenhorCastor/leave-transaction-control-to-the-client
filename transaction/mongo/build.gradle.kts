group = "io.transaction.mongo"

tasks.getByName<Jar>("jar") {
    archiveBaseName.set("io.transaction.mongo")
}

dependencies {
    implementation(Dependencies.mongo.kMongo)

    implementation(project(":transaction:interface"))
}
