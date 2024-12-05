## CURRENTLY BROKEN!
- Functionality may currently not work for any pulls made from this github repo. 
- Will Change status once verified working.

# Vehicle Parts Mod for Minecraft 1.7.10
<details>
<summary>More Info:</summary>

### This is a tiny mod to add items to mc 1.7.10 for the play.wargames.uk server!
## Please join our discord at: discord.wargames.uk

### Version info:

Wargames Release 1.0 Used Vehicle Parts 0.3 (Pre-Release, since im lazy)

Wargames Release 2.0 Likely to use Vehicle Parts 1.0 (will jump out of Pre-Release), however might jump it to 2.0 to match the Server/Modpack release version for simplicity's sake.

### Contributions to the Project so far:

```ruby
   Myself (rhyshopkins04),
   NateBacon4
```

</details>


## Building from source

For when i have made changes that you need but haven't been bothered to send you the up to date .jar so you can come here, stop being lazy and build it yourself!!

 1. Make sure you have JDK8 installed. If not, download it from [adoptium.net](https://adoptium.net/?variant=openjdk8&jvmVariant=hotspot)
 2. If you don't have git installed, download&install it from [here](https://git-scm.com/downloads).
 3. Open up "Git Bash":
    * Press Windows Button, type "Git Bash" and press ENTER
 4. Enter the directory where you would like the sources to be (advanced users can use any directory)
 ```bash
     cd $HOME/Downloads
 ```
 5. Download the source code:
 ```bash
     git clone https://github.com/RhysHopkins04/VehicleParts.git
 ```
 4. Enter the source code directory
 ```bash
     cd VehicleParts
 ```
 5. Build the mod
 ```bash
     ./gradlew build
 ```
 6. Locate the mod file.
    1. Open up your file explorer.
    2. Navigate to the location where you downloaded the sources.
       * If you exactly followed step 1, it should be `C:/Users/%USER%/Downloads`.
    3. Enter the downloaded source tree.
    4. Navigate to `build/libs`.
    5. Grab the "VehicleParts-<mcversion>-<version>.jar" one.
        * This is your mod file. You can install it like any other mod by putting it into your mods directory.

## Contributing
If you want to make some changes to the mod yourself instead of just asking me to change things, follow this guide below, **PLEASE I BEG JUST DO IT YOURSELF**:
Some of the content below may be incorrect since i cannot remember what i did, 

<details>
<summary>If you are having issues:</summary>

### Please also check the README.txt file if things are not working, the main points can be seen below in the code blocks:

```ruby
   gradlew idea
```

OR

```ruby
   gradlew eclipse
```

AND OR

```ruby
   gradlew clean setDecompWorkspace (idea) or (eclipse)
```

</details>

1. Follow steps 1-2 from *Building from source* section
2. Create a directory where the repository will reside, using a name that is not "VehicleParts"
3. Download the forge src from [here](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.7.10.html) and extract it into the directory.
4. Download the source code:
  * Using Git Bash, enter wherever your directory is located:
```bash
    cd $HOME/Downloads
```
   * Download the source code:
```bash
    git clone https://github.com/RhysHopkins04/VehicleParts.git
 ```
   * Move or copy every file within the new folder into your directory, making sure to overwrite any files.
   * Feel free to delete the remaining folder and rename your directory
5. Enter the source directory
```bash
    cd VehicleParts
```
6. Setup forge decompilation workspace
```bash
    ./gradlew setupDecompWorkspace
```
### Necessary for Eclipse users
7. Generate eclipse files
```bash
    ./gradlew eclipse
```
8. Switch to the **eclipse** folder inside your directory as a workspace.
9. If necessary, make sure that Eclipse is using the JDK8.
   * On Linux, enter Windows>Preferences>Java>Installed JREs.
      * Click search to navigate to /usr/lib/jvm and open it. Select the Java 8 JDK (e.g., java-8-openjdk).
      * Afterwards, enter Execution Environment, select JavaSE-1.8, and select the jre listed as a **[perfect match]**
   * On Windows, you may need to set your JAVA_HOME.
      * Search for Environment Variables and click Edit the System Environment Variables.
      * Click Environment Variables. Click new under System Variables.
      * Enter **JAVA_HOME** under Variable Name and enter the path to your JDK 8 under Variable Value (e.g., C:\Program-Files\Java\jdk1.8.0_102).
      * In Eclipse, now enter Windows>Preferences>Java>Installed JREs.
      * Click **Add Standard VM**; in the JRE home, navigate to the directory where the JDK is installed, then click finish and select it.
10. Code!

## If any issues arise do not annoy me over it.. <br> <br>This project is a load of badly put together bs that should never have seen the light of day on the internet...
