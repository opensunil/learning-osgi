learning-osgi
=============

a) Understand core concepts
   1. Maven 
      1) archetype:generate option 238 [org.apache.karaf.archetypes:karaf-bundle-archetype (A simple bundle archetype.)]
   2. Karaf
      1) log
      	 tail -f ${KARAF_HOME}/data/log/karaf.log
b) Start and stop services
   In Example 6, the uninstall/reinstall of bundles requires a refresh for the event listener to pick up the changes.  Doing a refresh in the osgi container right after uninstall keeps the references straight.