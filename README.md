# hello-world-java-hibernate

This repo has a "Hello World" Java application that uses the [Hibernate ORM](http://hibernate.org/) to talk to [CockroachDB](https://www.cockroachlabs.com/docs/stable/).

To run the code:

1. Start a [local, insecure CockroachDB cluster](https://www.cockroachlabs.com/docs/stable/start-a-local-cluster.html).

2. Create a `bank` database and `maxroach` user as described in [Build a Java app with CockroachDB and Hibernate](https://www.cockroachlabs.com/docs/stable/build-a-java-app-with-cockroachdb-hibernate.html#insecure).

3. From the [SQL client](https://www.cockroachlabs.com/docs/stable/cockroach-sql.html): `GRANT ALL ON DATABASE bank TO maxroach`

4. In your terminal, from this directory: `gradle run`
