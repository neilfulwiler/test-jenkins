# README

For testing jenkins. I've been roughly following [this tutorial]( http://www.okta.com/blog/2012/04/simple-jenkins-configuration-and-deployment/) for jenkins setup. 

## Things I've learned

* you can't just 

```
mkdir new-repo
cd new-repo && git init
git remote add origin git@github.com:neilfulwiler/new-repo.git
git push origin master
```

you actually need to press the big green button on github.com
(or use the github api with curl)
