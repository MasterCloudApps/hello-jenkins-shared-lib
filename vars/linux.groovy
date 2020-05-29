def call(Closure body) {
    node('linux') {
        sh 'env'
        body()
    }
}