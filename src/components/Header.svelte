<script>
    import { fade, fly } from 'svelte/transition';
    import {userName,basketID} from "./_stores.js";
    import { redirect,goto, url } from '@sveltech/routify';
   // import {userName, basketID} from "../../components/_stores.js";
    function goToViewCart() {
        $goto('/shoppingcart');
    }

    function goHome(){
        console.log("going home.");
        $goto('/dashboard');
    }

    let basketPk
</script> 

<section class=" flex justify-between items-center bg-gray-900 z-10 border-b max-w-2xl px-3 mx-auto py-3">
    
     
    <div class="flex justify-center items-center py-2 md:px-2 w-32">
         <!--a href="localhost:5000" class="flex"-->
         <button on:click={goHome} class="focus:outline-none ">
                <svg class="h-8 w-8 text-pink-100 " xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="1" d="M16 11V7a4 4 0 00-8 0v4M5 9h14l1 12H4L5 9z" />
                </svg>
                <!--on:click={goHome} class="focus:outline-none"-->
                <h3 class="text-gray-100 font-sans text-white text-md mx-auto  mb-2">GF Store</h3>
        </button>
    </div>

    <div class="flex flex-wrap justify-center items-center ">
        <!--input placeholder=" search items" class="focus:outline-none w-40 md:w-64 bg-blue-800 border-pink-100 border text-gray-200 px-2"-->
        <span class="text-lg md:text-2xl text-yellow-500 px-1">
            {$userName}
        </span>
        <span class="text-base md:text-lg text-pink-100 px-1">
            , your BasketID # is 
        </span>
        <span class="text-pink-500 rounded-lg border-2 p-2 text-lg md:text-2xl"> {$basketID}</span>

    </div>

    <div class="focus:outline-none   items-center justify-center border-gray-800 md:px-4">      
          <button on:click={goToViewCart} class="flex flex-col focus:outline-none">
                <svg class="h-8 w-8 md:h-12 md:w-12 text-pink-100 " xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="1" d="M3 3h2l.4 2M7 13h10l4-8H5.4M7 13L5.4 5M7 13l-2.293 2.293c-.63.63-.184 1.707.707 1.707H17m0 0a2 2 0 100 4 2 2 0 000-4zm-8 2a2 2 0 11-4 0 2 2 0 014 0z" />
                </svg>
                <h3 class="text-gray-100 font-sans  text-white text-md mx-auto ">Cart</h3>
          </button>
    </div>

</section>