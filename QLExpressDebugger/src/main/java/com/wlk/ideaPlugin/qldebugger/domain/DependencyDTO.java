package com.wlk.ideaPlugin.qldebugger.domain;

import java.util.Objects;

/**
 * @author 王利康
 * @date 2024/1/6 19:38:17
 */
public class DependencyDTO {
    public String groupId;
    public String artifactId;
    public String version;

    public DependencyDTO(String groupId, String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }

    public String buildMavenUrl(){
        String s = groupId.replaceAll("\\.", "/");
        return s+"/"+artifactId+"/"+version+"/"+artifactId+"-"+version;
    }
    public String buildMavenJarUrl(){
        return buildMavenUrl()+".jar";
    }

    public String buildMavenPomUrl(){
        return buildMavenUrl()+".pom";
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        DependencyDTO that = (DependencyDTO)o;
        return groupId.equals(that.groupId) && artifactId.equals(that.artifactId) && version.equals(that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, artifactId, version);
    }

    public String buildShowName(){
        return groupId+":"+artifactId+":"+version;
    }

    public String buildShowNameWithoutVersion(){
        return groupId+":"+artifactId;
    }

    public String buildLocalFileName(){
        return artifactId+"-"+version+".jar";
    }
}
