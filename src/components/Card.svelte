
<script>
  import { goto } from '@sveltech/routify'

  export let imgSrc;
  export let productName;
  export let producePrice;
  export let stock;
  export let getItemID;
  export let getBasketID;

  async function addToCart(itemid,basketid){   
          console.log("added to cart ..");
          console.log(itemid.getItemID);
          console.log(basketid.getBasketID);

            const res = await fetch('http://localhost:8085/newItem', {
                method: 'POST',
                mode: 'cors',
                headers: {
                'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    "basketID": basketid.getBasketID,
                    "itemID": itemid.getItemID
                })
              });       
              let json =  await res.json()
              console.log(json);
              return json;    
  }
</script>

<style>

</style>

<section class="m-5 flex flex-col items-center w-56 h-66 rounded-lg overflow-hidden shadow-lg px-4 
                rounded-lg border-b-2 border-blue-900 mb-2 bg-gray-800">
 
      <div class="font-bold text-lg font-sans px-2 w-72 py-1">
          <img class="h-40 w-full object-cover object-top py-1" src={imgSrc} alt="product">
          <div class="flex flex-col items-center justify-center px-6">
              <div class="text-base text-gray-300"> 
                {productName}
              </div>
              <p class=" text-yellow-500 text-sm">
               $ {producePrice}
              </p>
              <div class="flex items-center justify-center">
                <p class="inline text-gray-400 text-xs">
                  stock: 
               </p>
               <p class="inline text-teal-400 text-xs px-1">
                {stock}
             </p>
              </div>
        
           </div> 
      </div>
  
  <section class="flex flex-col items-between h-50 w-72 bg-gray-800">
        <button on:click={addToCart({getItemID},{getBasketID})}
            class=" mb-2 focus:outline-none flex justify-center w-32 rounded bg-green-600  text-gray-900 antialiased font-bold py-1 mt-2
                  transition duration-200 ease-in-out hover:bg-red-500 transform focus:-translate-y-1 focus:scale-110">
            <svg class="h- w-5 font-light text-gray-200 mr-1 text-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor">
              <path fill-rule="evenodd" d="M3.293 9.707a1 1 0 010-1.414l6-6a1 1 0 011.414 0l6 6a1 1 0 01-1.414 1.414L11 5.414V17a1 1 0 11-2 0V5.414L4.707 9.707a1 1 0 01-1.414 0z" clip-rule="evenodd" />
            </svg>
            <span class="text-gray-200 text-sm">Add to Cart</span>
        </button>        
        
  </section>
  
</section>