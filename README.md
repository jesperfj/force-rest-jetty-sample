# Sample Force.com REST API application

This is a simple example of how you can build Java apps that are [Force.com REST API](https://deveoper.force.com/rest) clients. It currently depends on forked, modified versions of maven-force-plugin and java-sdk.

## How to build

It's best to build this sample from the aggregator project because it depends a couple of other repos. See instructions at [force-rest-sample-aggregator](https://github.com/jesperfj/force-rest-sample-aggregator).

## How to run

Set your force.com connection info in an environment variable like this:

    $ export FORCE_DEV_URL="force://login.salesforce.com?user=user@domain.com&password=mypasswordmysecuritytoken"

Now you can run the app from the `force-rest-jetty-sample` directory:

    $ foreman start
    13:01:06 web.1     | started with pid 62720
    13:01:09 web.1     | 2011-11-15 13:01:09.295:INFO:oejs.Server:jetty-7.5.4.v20111024
    13:01:09 web.1     | 2011-11-15 13:01:09.342:INFO:oejsh.ContextHandler:started o.e.j.s.ServletContextHandler{/,null}
    13:01:09 web.1     | 2011-11-15 13:01:09.358:INFO:oejs.AbstractConnector:Started SelectChannelConnector@0.0.0.0:5000 STARTING

## How to generate SObject classes

The sample app just has an Account class, but you can generate a class for every SObject in your org by executing

    $ mvn force:codegen
    [INFO] Scanning for projects...
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building force-rest-jetty-sample 1.0-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-force-plugin:22.0.8-SNAPSHOT:codegen (default-cli) @ force-rest-jetty-sample ---
    [WARNING] Could not transfer metadata asm:asm/maven-metadata.xml from/to local.repository (file:../../local.repository/trunk): No connector available to access repository local.repository (file:../../local.repository/trunk) of type legacy using the available factories WagonRepositoryConnectorFactory
    SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
    SLF4J: Defaulting to no-operation (NOP) logger implementation
    SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
    [INFO] Using JSON generator
    [INFO] Generating Force.com classes in /Users/jjoergensen/dev/force-rest-sample-aggregator/force-rest-jetty-sample/src/main/java
    [INFO] Successfully generated 167 JPA classes
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 7.003s
    [INFO] Finished at: Tue Nov 15 13:02:09 PST 2011
    [INFO] Final Memory: 5M/81M
    [INFO] ------------------------------------------------------------------------

Classes will be generated in `src/main/java/org/example/entity`.
