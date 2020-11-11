<script>
  import { url, layout } from "@sveltech/routify";
  import Header from "../../components/Header.svelte";
  import Footer from "../../components/Footer.svelte";
	import Card from "../../components/Card.svelte";
	//import Modal from "../../components/Modal.svelte";
  import {userName, basketID} from "../../components/_stores.js";
  import { fade, fly } from 'svelte/transition';
  import { onMount } from 'svelte';

    let user = [];

    onMount(async () => {
        const res = await fetch(`http://localhost:8085/getLastUser`);
        user = await res.json();
        console.log(user);
        $userName = user.basketHolder;
        $basketID = user.basketID;
    });
  let itemsForSale=[
      {
          "productName": "Zilong",
          "productPrice": "100.00",
          "imgSrc": "/static/images/Zilong.jpg",
          "stock": "20",
          "idproduct": "1000"
      },
      {
          "productName": "Fanny",
          "productPrice": "100.00",
          "imgSrc": "/static/images/Fanny.jpg",
          "stock": "20",
          "idproduct": "1001"
      },
      {
          "productName": "Claude",
          "productPrice": "100.00",
          "imgSrc": "/static/images/Claude.jpg",
          "stock": "20",
          "idproduct": "1002"
      },
      {
          "productName": "Harith",
          "productPrice": "100.00",
          "imgSrc": "/static/images/Harith.jpg",
          "stock": "20",
          "idproduct": "1003"
      },
      {
          "productName": "Gusion",
          "productPrice": "100.00",
          "imgSrc": "/static/images/Gusion.jpg",
          "stock": "20",
          "idproduct": "1004"
      },
      {
          "productName": "Alucard",
          "productPrice": "100.00",
          "imgSrc": "/static/images/Alucard.jpg",
          "stock": "20",
          "idproduct": "1005"
      } 
  ];
      
  

</script>

<Header/>

<body class="flex flex-col h-full  max-w-2xl px-3 mx-auto bg-gray-900 items-center">
	<section class="flex w-11/12 items-center justify-center items-center py-2 mt-5 ">
 
    <section class="flex max-w-4xl h-50% flex ">
      <div class="mb-1 flex flex-wrap  justify-center">			
        {#each itemsForSale as item}
             <Card  getBasketID={user.basketID} getItemID={item.idproduct}  imgSrc={item.imgSrc} productName={item.productName} producePrice={item.productPrice} stock={item.stock}/>
         {/each}
      </div>
            
    </section>	
		
	 </section>
</body>


<Footer/>







