function solution(arr)
{
   var answer = arr;
    let result = []
    
       for(let i =0; i< answer.length; i++){
           if(answer[i] !== arr[i+1]){
               result.push(arr[i]);
           }
       }

   
    
    return result;
}