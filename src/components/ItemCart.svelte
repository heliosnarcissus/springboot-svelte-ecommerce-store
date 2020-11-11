<script>
  import { goto } from '@sveltech/routify'
  import { basketID } from './_stores';
  import { createEventDispatcher } from 'svelte';

  export let imgSrc ='';
  export let productName;
  export let productPrice;
  export let stock;
  export let itemCount;
  export let itemID;

  const dispatch = createEventDispatcher();

  async function removeFromCart(itemid){
        console.log(JSON.stringify({itemid}));
        let URI = 'http://localhost:8085/deleteItem/'+$basketID+'/'+itemid;
         const res = await fetch(URI, {
            method: 'DELETE',
            mode: 'cors',
            headers: {
               'Content-Type': 'application/json'
            }
          });  
          let json =  await res.json()
          dispatch('reloadItemsInBasket');

          return json;         
   }
  
  function incrementItem(n){
    console.log("quantity is: " +n);
         --n;
         console.log("quantity is: " +n);
  }
  function decrementItem(n){
    console.log("quantity is: " +n);
         ++n;
         
         console.log("minus 1" + n);
  }

let imagePath = '/static/images/'+String(imgSrc)+'.jpg';

$: console.log(imgSrc);
</script>

<style>

</style>

<section class="mb-5 mt-2 flex items-center justify-around w-full h-24  overflow-hidden shadow-sm px-4 
                border-b-2 border-blue-900 mb-2 bg-gray-800">
 
      <div class="flex items-center font-bold text-lg font-sans px-2 w-72 py-1">
          <img class=" -ml-3 rounded-full h-10 w-10 md:h-20 md:w-20 object-cover object-top " src={imagePath}  alt={imagePath}/>
          
          <div class="flex flex-col items-start justify-start px-6  -ml-4 md:-ml-1">
                <div class="text-sm md:text-base text-gray-300"> 
                   {productName}
                </div>
                <p class="text-sm md:text-base text-yellow-500 text-sm">
                     $ {productPrice}
                </p>
                <div class="text-sm md:text-base flex items-center justify-center">
                    <p class="inline text-gray-400 text-xs">
                      stock: 
                    </p>
                    <p class="text-xs md:text-sm inline text-teal-400 text-xs px-1">
                    {stock}
                    </p>
                </div>
             
           </div> 
           <section class="flex  items-center justify-center h-16 w-24 md:h-50 md:w-72 px-2 ">
            <button on:click={decrementItem(itemCount)}
                    class="h-8 w-8 font-light text-gray-200 mr-1 text-lg mb-2 focus:outline-none flex justify-center w-16 rounded   text-gray-900 antialiased font-bold py-1 mt-2">
                  <svg class="w-6 h-6 md:h-8 md:w-8 font-light text-gray-200  text-lg"  xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M15 12H9m12 0a9 9 0 11-18 0 9 9 0 0118 0z" />
                  </svg> 
            </button>    
            <div class="flex justify-center items-center px-1">
                <span class="flex text-lg text-pink-100 font-bold">{itemCount}</span>
            </div>
            

            <button on:click={incrementItem(itemCount)}
                 class="h-8 w-8 font-light text-gray-200  text-lg mb-2 focus:outline-none flex justify-center w-16 rounded   text-gray-900 antialiased font-bold py-1 mt-2">
                <svg class="w-6 h-6 md:h-8 md:w-8 font-light text-gray-200 text-lg" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                  <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 9v3m0 0v3m0-3h3m-3 0H9m12 0a9 9 0 11-18 0 9 9 0 0118 0z" />
                </svg>  
            </button>            
      </section>

      </div>
      <section class="flex justify-end  h-50 w-72  md:items-end ">
        <button on:click={removeFromCart(itemID)}
            class="mb-2 focus:outline-none flex justify-end md:justify-center w-16 rounded md:bg-red-600 antialiased font-bold py-1 mt-2
                   transition duration-200 ease-in-out hover:bg-pink-100 transform focus:-translate-y-1 focus:scale-110">     
            
              <svg  class="h-8 w-8 font-light text-red-600 md:text-gray-200 mr-1 text-lg" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 7l-.867 12.142A2 2 0 0116.138 21H7.862a2 2 0 01-1.995-1.858L5 7m5 4v6m4-6v6m1-10V4a1 1 0 00-1-1h-4a1 1 0 00-1 1v3M4 7h16" />
              </svg>
        </button>            
    </section>
     
  
</section>