#需要从jflex的官网上去下载个，然后再在这里使用
#不能使用idea中右键菜单自动下载的 jflex-1.9.1.jar，里面应该是有特殊的逻辑，会修改advance方法，导致没法自测
export PATH=$PATH:$HOME/Env/jflex-1.9.1/bin
cd $HOME/GithubProjects/WLKIdeaPlugin/ApexSupport || return
jflex -d src/main/gen/com/wlk/ideaplugin/apexsupport/language/parser \
src/main/resources/grammar/ApexCls.flex
