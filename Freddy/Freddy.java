
public class Freddy{

   public void freddyCalculation(int distance)
{
        int i = 0;
        int hops = 0;
        float time = 0;
        while(i<distance)
{
            i = i + 5;
            if(i<=distance)
{
                hops = hops + 1;
                time = time + 1;
                i = i + 3;
                if(i<=distance)
{
                   hops = hops + 1;
                   time = time + 2;
                   i = i + 1;
                   if(i<=distance)
{
                       hops = hops + 1;
                       time = (float) (time + (3.5));
                   }
                   else
{
                       break;
                   }
                }
                else
{
                    break;
                }
            }
            else
{
                break;
            }
        }
        
        System.out.println("No of hops "+hops);
        System.out.println("Time taken= "+time);
}
}
