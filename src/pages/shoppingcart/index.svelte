<script>
  import { url, layout,goto } from "@sveltech/routify";
  import Header from "../../components/Header.svelte";
  import Footer from "../../components/Footer.svelte";
	import ItemCart from "../../components/ItemCart.svelte";
  import {userName, basketID} from "../../components/_stores.js";
  import { fade, fly } from 'svelte/transition';
  import { onMount } from 'svelte';
  
  let promiseList = new Promise(() => {});
  let itemsList = [];
  let pageLoaded = false;
  let user;
      onMount(async () => {
        let URI = 'http://localhost:8085/fetchAllItemObjects/'+ $basketID ;
        let res = await fetch(URI);
        itemsList = await res.json();
        pageLoaded = true;

        const getLastUser = await fetch(`http://localhost:8085/getLastUser`);
        user = await getLastUser.json();
        $userName = user.basketHolder;
        $basketID = user.basketID;
    });

    async function reloadItemsInBasket(){
        let URI = 'http://localhost:8085/fetchAllItemObjects/'+ $basketID ;
        let res = await fetch(URI);
        itemsList = await res.json();
        pageLoaded = true;
    }

    function checkOut(){
     
      console.log("CHECKOUT. GET TOTAL AMONT");
      $goto('/');
   }
</script>

<Header/>

<body class="flex flex-col min-h-screen  max-w-2xl px-3 mx-auto bg-gray-900 items-center justify-between">
  <section class="flex flex-col items-center h-full w-11/12 justify-center items-center py-2 mt-5 "> 
        <div class="flex flex-start self-start">
            <span class="text-white text-xl">
                Items in Basket
            </span>
        </div>
    
        <section class="flex h-50%  flex w-full mt-2">
            <div class="mb-1 flex flex-col  justify-center w-full">			
              {#each itemsList as item (item.itemID)}
                  <ItemCart on:reloadItemsInBasket={reloadItemsInBasket}     itemID={item.itemID}  itemCount={item.quantity} imgSrc={item.itemName} productName={item.itemName} productPrice={item.itemPrice} stock={item.itemStockCount}/>   
                 
              {/each}
            </div>     
        </section>
        
        
		
   </section>
   
   <section class="mb-5 mt-2 flex items-center justify-between w-full h-16  overflow-hidden shadow-sm px-4 
                border-b-2 border-blue-900 mb-2 bg-green-500">
                <section class="flex items-center text-base  w-32">
                      <span class="text-lg md:text-xl text-gray-900">
                           total:
                      </span>
                      <span class="font-bold text-2xl ml-6 text-purple-900"> 
                          {#if itemsList.length > 0}
                                {itemsList[0].totalPricePerBasket}
                            {:else}
                                <span class="text-lg text-pink-100">0.00</span>
                          {/if}                          
                      <span>
                </section>
                <section class="flex flex-col rounded-lg">
                    <button on:click={checkOut} class="rounded-lg shadow border-2 p-2 flex bg-pink-700">
                        <span class="px-1 text-pink-100 md:text-xl">
                           Checkout
                        </span> 
                        <svg class="w-6 h-6 md:h-8 md:w-8 font-light text-gray-200  text-lg" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                          <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M13 9l3 3m0 0l-3 3m3-3H8m13 0a9 9 0 11-18 0 9 9 0 0118 0z" />
                        </svg>
                    </button>
            </section>
        </section>
</body>


<Footer/>







