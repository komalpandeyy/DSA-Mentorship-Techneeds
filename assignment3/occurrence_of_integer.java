
class occurence_of_integer{
    int findFrequency(int Arr[], int X){
        int count = 0;
        for(int ele:Arr){
            if(ele==X){
                count++;
            }
        }
        return count;
    }
}
