import hudson.model.User

HTML_REPORT_PATH = ""
GITHUB_USERNAME = "tishyk"
KNOWN_BRANCHES = ["main", "develop"]

def show_branches() {
  for (branch in KNOWN_BRANCHES) {
    pritnl("${branch}")
    }
}

def admin_user(user){
  return hudson.model.User.get("admin")
}

def check_branch(branch){
  def known_branch = false
  if (branch in KNOWN_BRANCHES) {
    println("Branch ${branch} is in known branches list") 
    known_branch = true
  }
  else {
      println("Branch ${branch} is in known branches list")  
  }
  return known_branch
}
