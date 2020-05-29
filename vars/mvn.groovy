def call(String toolName, String command) {
    def dir = tool toolName
    sh "${dir}/bin/mvn ${command}"
}