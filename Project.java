package compareMethod;


public class Project implements Comparable<Project>
{
public Project(int projectId, String projectName, String projectType, int numOfEmp) {
super();
this.projectId = projectId;
this.projectName = projectName;
this.projectType = projectType;
this.numOfEmp = numOfEmp;
}
int projectId ;
private String projectName;
private String projectType;
private int numOfEmp;
public int getProjectId() {
return projectId;
}
public void setProjectId(int projectId) {
this.projectId = projectId;
}
public String getProjectName() {
return projectName;
}
public void setProjectName(String projectName) {
this.projectName = projectName;
}
public String getProjectType() {
return projectType;
}
public void setProjectType(String projectType) {
this.projectType = projectType;
}
public int getNumOfEmp() {
return numOfEmp;
}
public void setNumOfEmp(int numOfEmp) {
this.numOfEmp = numOfEmp;
}
@Override
public String toString() {
return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectType=" + projectType
+ ", numOfEmp=" + numOfEmp + "]";
}
@Override
public int compareTo(Project o) {
// TODO Auto-generated method stub
return this.projectId-o.projectId;
}
}

