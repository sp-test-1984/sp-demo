# Creating a Basic Cucumber (java) Using Maven

## Step 1: Create a Maven Skeleton from a Maven Archetype

From a folder structure of your choosing, type the Maven command below: 

`mvn archetype:generate -DinteractiveMode=false -DgroupId=com.sp.ipv -DartifactId=ipv -DarchetypeArtifactId=maven-archetype-quickstart`


## Step 2: Add Cukes Dependencies 

`ipv >> pom.xml`

     ```<dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>1.1.6</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>1.1.6</version>
            <scope>test</scope>
        </dependency>```


## Step 3: Add Cucuber Runner

`src/test/java/com/com/sp/ipv/IPVTest.java`


   ```
   package com.sp.ipv;


   import cucumber.api.CucumberOptions;
   import cucumber.api.SnippetType;
   import cucumber.api.junit.Cucumber;
   import org.junit.runner.RunWith;

   @RunWith(Cucumber.class)
   @CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        plugin = "html:out"
        )
   public class IPVTest {
   
   }
   
   ```


## Step 4: Add Build plugin (avoid source 1.5 is not longer an option problem)


```
      <build>
        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
      </build>
```
      
## Step 5: Install 3rd Party jar to Local ( sikulix )


```
    mvn install:install-file -Dfile=./sikulixapi.jar -DartifactId=sikuli-api -DgroupId=org.sikuli -Dversion=100.0 -Dpackaging=jar

``` 

