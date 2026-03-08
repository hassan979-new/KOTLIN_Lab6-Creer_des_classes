class Player(val name:String, val surName:String){
    
    var totalScore : Int = 0
    var personalBestScore : Int = 0
        
    fun fullName():String{
        return name + " " + surName
    }
}

class Score{
    fun updateBest(best: Int, current: Int): Int{
        if (current > best){
            println("Congratulation!!! New Best Score : $current")
            return current
        }
        return best
    }
}

fun main() {
    val p1 = Player("Hassan", "Agouram")
    val scoring = Score()

    println( "==============="+p1.fullName()+"===============")
    
    val lvlScores1 = listOf(20, 35, 15)
    
    for (score in lvlScores1){
        p1.totalScore += score
    	p1.personalBestScore = scoring.updateBest(p1.personalBestScore, score)
    }
    println("Total = " + p1.totalScore)
    println("Best = " + p1.personalBestScore)

    
    val p2 = Player("Oussama", "Ait Hmad")
    println("==============="+p2.fullName()+"===============")
    val lvlScores2 = listOf(30, 12, 50)
    
    for (score in lvlScores2){
        p2.totalScore += score
    	p2.personalBestScore = scoring.updateBest(p2.personalBestScore, score)
    }
    
    println("Total = " + p2.totalScore)
    println("Best = " + p2.personalBestScore)
    
    
    println("=============== Final Results ===============")
    if (p1.totalScore > p2.totalScore){
        println("Player: " + p1.fullName() + " Wins!!! With a total score of: " + p1.totalScore)
    }else if (p2.totalScore > p1.totalScore){
        println("Player: " + p2.fullName() + " Wins!!! With a total score of: " + p2.totalScore)
    }else{
        println("It's a draw!!!")
    }
}