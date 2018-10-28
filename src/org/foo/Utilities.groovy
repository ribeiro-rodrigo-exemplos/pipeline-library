package org.foo 

class Utilities /*implements Serializable*/{
    /*def steps 
    
    Utilities(steps){
        this.steps = steps; 
    }*/

    /*def mvn(args){
        steps.echo "${args} --- "
    } */

    static def mvn(script,args){
        script.echo "Print -> ${args}"
        script.sh "${script.tool 'localMaven'}/bin/mvn -v"
    }
}