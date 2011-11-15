This project is a simple aggregator project that let's you quickly clone and build the force-rest-sample along with forks of maven-force-plugin and java-sdk.

## How to build

clone this repository and check out submodules:

    $ git clone --recursive https://github.com/jesperfj/force-rest-sample-aggregator.git

If you want to run tests, you'll need to set up a test.properties file in the force-rest-api repo. Checkout the README in the repo for more detail.

Build without running tests:

    $ cd force-rest-sample-aggregator
    $ mvn install -DskipTests

## How to run

Now set your Force.com username and password in environment variables:

    $ export FORCE_USERNAME=john@doe.com
    $ export FORCE_PASSWORD=secretpassword

Now you can run the app from the `force-rest-jetty-sample` directory:

    $ cd force-rest-jetty-sample
    $ foreman start
