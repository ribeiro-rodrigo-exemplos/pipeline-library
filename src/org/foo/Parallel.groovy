@Grab('org.apache.commons:commons-math:3.4.1')
import org.apache.commons.math3.primes.Prime 

void parallelize(int count){
    if (Prime.isPrime(count)){
        echo "${count} é prime"
    }
}