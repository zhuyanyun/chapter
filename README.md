# chapter
spring4 x实战代码
  
  1，这是精通 spring4 x实战代码
  2，java 逆向工程介绍  https://blog.csdn.net/qq_33530266/article/details/79018788
      逆向工程配置多张表，看下NB，这个逆向工程不太好，还是去看看NB的了
      NB有两个问题：@t_表头开始，生成的java文件首字母不大写
      
      
      
      
      
      
      
      
      
      
 遇到问题以及解决：
  1， git 403 问题
      解决git push 中remote: Permission to xxxxx.git denied to xxx. fatal: unable to access 'https://github.com/ xxxxx.git/':            The requested URL returned error: 403
      remote: Permission to xxxxx.git denied to xxx.
      fatal: unable to access 'https://github.com/ xxxxx.git/': > The requested URL returned error: 403
      解决方案
      第一步，将github中的项目clone下来
      第二步，修改.git/cofig中的url
      cd 到项目中，编辑 .git/cofig中的url
      vim .git/config
      将
      [remote "origin"]
      url = https://github.com/git的用户名/项目名称
      的url改为
      url = https://git的用户名@github.com/git的用户名/项目名称

      第三步，git push -u origin master
