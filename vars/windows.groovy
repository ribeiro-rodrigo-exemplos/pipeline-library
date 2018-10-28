def call(Closure body){
    node('any'){
        body(); 
    }
}