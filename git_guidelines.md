# Using Git to manage configuration of your project

* Download and install [Git](http://git-scm.com/) on your machine
        
  - Download and install [SourceTree](https://www.sourcetreeapp.com/) --- a GUI for doing git operations.    
    
* Run Git-bash program as `Administrator`
    
* `git config --global user.name "FirstName LastName" `
    
* `git config --global user.email "youremail@gmail.com"`
    
* `mkdir /path/to/your/project`
    
* `cd /path/to/your/project`
    
*  `git init`

* Add your project artifacts to this folder
    
    - `git status` to know where you are, in case you lost!
    
    - `git add .` to all files, `git add <filename>` to add specific file
    
    - `git commit -am"proposal added"` to commit your changes permanently

    -`git log` to see your commit history 
    
# To host your application on cloud!

- You have two options here: 
    1. [GitHub](https://github.com/)

        GitHub allows infinite open source applications to be hosted with free of cost. Great for open source project, but takes fees for hosting closed-source projects. 
    2. [BitBucket](https://bibucket.org/)

        BitBucket allows 5 closed source project with a team size of 5 users. Great for closed source projects, but takes fees for hosting open source projects.
        
- Choose wisely, I suggest you to use BitBucket initially, then when you are ready, go public on GitHub.

- The general guidelines in this document works equally well for both the GitHub and BitBucket.

- Create a account on [BitBucket](https://bitbucket.org) or [GitHub](https://github.com).
- Create a repository for holding your project.
- General instructions are given on the sites as well.
- On your local repository `git remote add origin https://github.com/user/repo.git` to add remote repository named `origin`.
- Verify your remote repository list using `git remote -v`
- Push your commits to the remote repository using `git push -u origin master`
- `git diff` your merge conflicts in case of any.
- To pull source from remote to any other local repository use `git pull origin`
 
# Some useful Git resources

0. Learn the basics of git from [TryGit](https://try.github.io/levels/1/challenges/1), It will take just about 15 minutes.

1. Repeat a few times over a week to get more confidence on this

2. `git status`

3. `git log` 

4. `git add .` 

5. `git commit -am "some message"` 

6. `git push -u origin master`

7. Keep hacking git, you got a lot to learn here!

**Welcome to the *Rabbit Hole***
