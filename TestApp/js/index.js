// json array movement variable
let i = 0;
let correctCount =0 ;
//initialize the first question


generate(0);
// generate from json array data with index
function generate(index) {
    document.getElementById("score").innerHTML = correctCount;
    document.getElementById("number").innerHTML = QuestionBank[index].no;
    document.getElementById("question").innerHTML = QuestionBank[index].question;
    document.getElementById("optiont1").innerHTML = QuestionBank[index].option1;
    document.getElementById("optiont2").innerHTML = QuestionBank[index].option2;
    document.getElementById("optiont3").innerHTML = QuestionBank[index].option3;
}

function checkAnswer() {
    
    

    if (document.getElementById("option1").checked && QuestionBank[i].option1 == answer[i].answer) {
       correctCount++;
    }
    if (document.getElementById("option2").checked && QuestionBank[i].option2 == answer[i].answer) {
        correctCount++;
    }
    if (document.getElementById("option3").checked && QuestionBank[i].option3 == answer[i].answer) {
        correctCount++;
    }



    // increment i for next question
    i+=1;
    //deselect all options
    document.getElementById("option1").checked = false;
    document.getElementById("option2").checked = false;
    document.getElementById("option3").checked = false;

    if(QuestionBank.length === i){
        alert("Your score is "+correctCount+" out of 5.\n Click OK to review.");
        window.open("result.html","_self")
        
    }
    else if(QuestionBank.length -1 === i){
        document.getElementById("myButton1").value="Submit | Result";
        generate(i);
    }
    else{
    // callback to generate
    generate(i);

    }
}
function score(){
    return correctCount;
}