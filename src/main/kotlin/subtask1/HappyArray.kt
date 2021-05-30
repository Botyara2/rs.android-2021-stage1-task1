package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        val newArray = sadArray.toMutableList()
        var readyArray: Boolean = false

        while (!readyArray)
        {
            readyArray = true
            for (i in 1 until newArray.size)
            {
                if (i >= newArray.size-1)
                    break

                if (newArray[i] > newArray[i-1]+ newArray[i+1])
                {
                    newArray.removeAt(i);
                    readyArray = false
                }
            }
        }


        return newArray.toIntArray()
    }
}
