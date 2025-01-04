## 在idea中，点开此文件，在idea中直接运行即可

gradle_path="$HOME/.gradle"
echo 'gradle的配置路径：' $gradle_path
if [ -d $gradle_path ]; then
  echo $gradle_path ' 目录存在，直接复制'
  cp init.gradle ~/.gradle/init.gradle
else
  echo $gradle_path ' 目录不存在，先创建此目录'
  mkdir ~/.gradle
  cp init.gradle ~/.gradle/init.gradle

fi
echo '复制init.gradle 文件成功'
ls -alF $gradle_path