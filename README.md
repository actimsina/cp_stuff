# CP Guidelines

> Find some useful materials for the "Computing project".

# Using Git to manage configuration of your project

1. Create a account on [bitbucket.org](http://bitbucket.org)
<!-- 2. Your user name on the [bitbucket.org](http://bitbucket.org) should be named as `11_FirstName_LastName_NCCID` -->

3. Name your project repository `ProjectTitle` for example: (`HotelBookingSystem`)

4. Follow the instructions shown in the **Command line** option 
    

    i. Download and install Git from [Git](http://git-scm.com/) on your machine    
        * Download and install SourceTree [SourceTree](https://www.sourcetreeapp.com/) --- a GUI for doing git operations.    
    
    ii. Run Git-bash program as `Administrator`
    
    iii. `git config --global user.name "FirstName LastName" `
    
    iv. `git config --global user.email "youremail@gmail.com"`
    
    v. `mkdir /path/to/your/project`
    
    vi. `cd /path/to/your/project`
    
    vii.  `git init`
    
    viii. `git remote add origin https://yourusername@bitbucket.org/username/repo.git`

5. Add, create project artifacts to the repository
    
    i. Add your project artifacts to this folder
    
    ii. `git status`
    
    iii. `git add .`
    
    iv. `git commit -am"proposal added"`
    
    v. `git push -u origin master`


6. Goto Settings -> Access Management -> Users 
5. Add 'cpsoftwarica' 
6. Give either 'admin' or 'write' privilege
7. Press Add!

 
# Some useful Git commands

0. Learn the basics of git from [TryGit](https://try.github.io/levels/1/challenges/1), It will take just about 15 minutes.

1. Repeat a few times over a week to get more confidence on this

2. `git status`

3. `git log` 

4. `git add .` 

5. `git commit -am "some message"` 

6. `git push -u origin master`

7. Keep hacking git, you got a lot to learn here!

** Welcome to the *Rabbit Hole* **
