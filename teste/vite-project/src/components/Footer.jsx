import Home from '../assets/img/home.svg';
import Search from '../assets/img/search.svg';
import Library from '../assets/img/library.svg';
import styles from './Footer.module.css';


function Footer() {

  return (
    <>
    <footer>
    <div className={styles.footerItems}>
        <div className='footerItem'><a href='#home'><img
              alt=""
              src={Home}
              width="30"
              height="30"
              className=""
            />Inicio</a>
            </div>
        <div className={styles.footerItem}><a href='#home'><img
              alt=""
              src={Search}
              width="30"
              height="30"
              className=""
            />Pesquisar</a></div>
        <div className={styles.footerItem}><a href='#home'><img
              alt=""
              src={Library}
              width="30"
              height="30"
              className=""
            />Biblioteca</a></div>
    </div>
      </footer>
    </>
  );
}

export default Footer;
