<script>
  import { redirect,goto } from '@sveltech/routify'
  import Footer from "../components/Footer.svelte";

  let username='';
   
    //CREATE NEW BASKET HERE..
    async function startShopping(username){
        console.log("hello " + username);
         const res = await fetch('http://localhost:8085/newBasket', {
            method: 'POST',
            mode: 'cors',
            headers: {
             'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                "basketHolder": username,
            })
          });
        
          let json =  await res.json()
          $goto('../dashboard');
           return json;         
   }

</script>
<style>
</style>

<body class="flex flex-col h-full  max-w-2xl px-3 mx-auto bg-gray-900 items-center">
	<section class="flex w-11/12 items-center justify-center items-center py-2 mt-5 ">
 
    <section class=" flex h-screen max-w-4xl justify-center items-center ">
          <section class="flex flex-col justify-center items-center">
                <label class="justify-center items-center"for="name"> 
                  <span class="text-4xl text-gray-200">Enter Your Name</span>
              </label>
              <div>
                <input  bind:value={username} id="name" class="px-2 focus:outline-none h-16 w-64 text-2xl" type="text">
              </div>

              <button on:click={startShopping(username)} class="focus:outline-none flex justify-center items-center rounded-lg w-32 h-12 bg-green-400 py-4 mt-5" on:click={startShopping}>
                  <span class=" text-2xl text-gray-900 ">
                    Login
                  </span>
               </button>
              </section>       
    </section >	
		
	 </section>
</body>


<Footer/>