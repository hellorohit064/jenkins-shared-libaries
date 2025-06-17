def call(String url, String branch) {
    echo "Cloning repository: ${url} on branch: ${branch}"
    git url: url, branch: branch
}
