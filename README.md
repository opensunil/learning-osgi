learning-osgi
=============

a) Understand core concepts
   1. Maven 
      1) archetype:generate option 238 [org.apache.karaf.archetypes:karaf-bundle-archetype (A simple bundle archetype.)]
      2) karaf hot deploy
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-dependency-plugin</artifactId>
        <version>2.6</version>
        <executions>
          <execution>
            <id>copy-installed</id>
            <phase>install</phase>
            <goals>
              <goal>copy</goal>
            </goals>
            <configuration>
              <artifactItems>
                <artifactItem>
                  <groupId>${project.groupId}</groupId>
                  <artifactId>${project.artifactId}</artifactId>
                  <version>${project.version}</version>
                  <type>${project.packaging}</type>
                </artifactItem>
              </artifactItems>
              <outputDirectory>${KARAF_HOME}/deploy</outputDirectory>
            </configuration>
          </execution>
        </executions>
      </plugin>      
   2. Karaf
      1) log
      	 tail -f ${KARAF_HOME}/data/log/karaf.log
b) Start and stop services