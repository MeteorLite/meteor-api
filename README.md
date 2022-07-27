# meteor-api
Provides a backend for Meteor. The following modules are published for https://github.com/MeteorLite/meteor-Client
```
annotations  
api  
api-rs  
http  
logger  
mixins (as injected)
scripts
```
  
Import into IntelliJ, bump val release in root build.gradle.kts, execute the ```Publish API``` task that is built into the project.  
This will store the required modules in your MavenLocal dir, so meteor-Client can access them.
