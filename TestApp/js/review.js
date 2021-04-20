// json array movement variable
let i = 0;

generate(0);
// generate from json array data with index
function generate(index) {
    document.getElementById("number").innerHTML = QuestionBank[index].no;
    document.getElementById("question").innerHTML = QuestionBank[index].question;
    document.getElementById("optiont1").innerHTML = QuestionBank[index].option1;
    document.getElementById("optiont2").innerHTML = QuestionBank[index].option2;
    document.getElementById("optiont3").innerHTML = QuestionBank[index].option3;
    document.getElementById("correctAns").innerHTML = answer[index].answer;
    //document.getElementById("response").innerHTML = response[index];
}

function reviewAnswer() {
    
    i+=1;
    if(QuestionBank.length === i){
        if (confirm("Test will be start again!\nClick Cancel to review again. ") == true) {
            window.open("home.html","_self")
          }
          else{
            window.open("result.html","_self")
          }

    }
    else if(QuestionBank.length -1 === i){
        document.getElementById("myButton1").value="Play Again";
        generate(i);
    }
    else{
    // callback to generate
    generate(i);
    //alert("Hello");
    }
}