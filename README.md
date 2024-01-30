# hello-world-java-hibernate

This repo has a "Hello World" Java application that uses the [Hibernate ORM](http://hibernate.org/) to talk to [CockroachDB](https://www.cockroachlabs.com/docs/stable/).

For instructions on running the code in this repo, see [Build a Java app with CockroachDB and Hibernate](https://www.cockroachlabs.com/docs/stable/build-a-java-app-with-cockroachdb-hibernate.html).

### Local development

1. Launch CockroachDB:

``` sh
cockroach demo --insecure --no-example-database
```

2. Build the Gradle wrapper:

``` sh
gradle wrapper
```

3. Run the Gradle wrapper:

``` sh
./gradlew run
```