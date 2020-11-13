# hello-world-java-hibernate

This repo has a "Hello World" Java application that uses the [Hibernate ORM](http://hibernate.org/) to talk to [CockroachDB](https://www.cockroachlabs.com/docs/stable/).

To run the code:

1. Start a [local, secure CockroachDB cluster](https://www.cockroachlabs.com/docs/stable/secure-a-cluster).

2. Create a `bank` database, `maxroach` user, and user certificate as described in [Build a Java app with CockroachDB and Hibernate](https://www.cockroachlabs.com/docs/stable/build-a-java-app-with-cockroachdb-hibernate.html#secure).

3. From the [SQL client](https://www.cockroachlabs.com/docs/stable/cockroach-sql.html): `GRANT ALL ON DATABASE bank TO maxroach`

4. Enter the password you set for user `maxroach` in `src/main/resources/hibernate.cfg.xml` in the `<property name="connection.password"></property>` configuration property.

5. In your terminal, from this directory: `./gradlew run`
