package codebat1;

public class qwe {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = {1,4,3,2,5};
			int k = 4;
			
			
			
			int[] values = new int[arr.length-k+1];
			int count = 0;
			for (int i = 0; i<k; i++){
				count += arr[i];
			}
			values[0] = count;
			int maxVal = values[0];
			int maxInd = k-1;
			int i = 1;
			for (int j = k; j < arr.length; j++){
				count = 0;
				int ind = j-k;
				count = values[i-1] - arr[ind] + arr[j];
				values[i] = count;
				if (maxVal < count){
					maxInd = j;
					maxVal = count;
				}
				i++;
			}
			
			int[] res = new int[k];
			int j = maxInd -k+1;
			i = 0;
			while (j <= maxInd){
				res[i] = arr[j];
				j++;
				i++;
			}
			
			for (i = 0; i < res.length; i++){
				System.out.println(res[i] + " ");
				
			}
			return res; 
		}

	}


